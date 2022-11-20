<template>
  <div class="outer">
    <div class="header-left">
      <span><i class="el-icon-menu"></i></span>
      <span>桌台</span>
    </div>
    <HeaderRightComponent :avatar="avatarURL"/>
  </div>
</template>

<script>
import HeaderRightComponent from "@/views/Desktop/HeaderRightComponent";
export default {
  name: "HeaderComponent",
  components: {
    HeaderRightComponent
  },
  data() {
    return {
      avatarURL: 'https://himg.bdimg.com/sys/portraitn/item/public.1.fd595bb2.6vS6uTpx4mCssTkw-89kcg'
    }
  }
}
</script>

<style scoped>
  .outer {
    display: flex;
    align-items: flex-end;
    justify-content: space-between;
    height: 100%;

  }
  .header-left {
    display: flex;
    flex-direction: row;
    align-items: flex-end;
    justify-content: flex-start;
  }
  .header-left > span {
    font-size: xx-large;
    margin-right: 1rem;
  }




</style>
