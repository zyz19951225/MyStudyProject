<template>
  <div>
    {{message}}
  </div>
</template>

<script>
export default {
  data(){
    return{
      message:""
    }
  },
  // props: {
  //   mytest: String,
  // }
  methods:{
    getMessage(m){
      this.message=m;
    }
  }
}
</script>
