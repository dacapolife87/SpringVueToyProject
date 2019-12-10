<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>Essential Links</h2>
    <h3>{{textData}}</h3>
  </div>
</template>

<script>
export default {
  name: 'HelloVueWorld',
  data () {
    return {
      msg: ' Temp2 App',
      textData: {}
    }
  },
  created () {
    this.$http.get('/api/getDataWorld').then((resp) => {
      this.textData = resp.data.response
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
