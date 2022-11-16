<template>
  <div class="outer">
    <div class="header-left">
      <span><i class="el-icon-menu"></i> <span style="font-size: xx-large">桌台</span></span>
    </div>
    <div class="header-right">
      <span><i class="el-icon-printer"></i></span>
      <span><i class="el-icon-tickets"></i></span>
      <span><i class="el-icon-question"></i></span>
      <el-avatar :size="32" :src="avatarURL"></el-avatar>
    </div>
  </div>
</template>

<script>
export default {
  name: "HeaderComponent",
  data() {
    return {
      avatarURL: 'https://himg.bdimg.com/sys/portraitn/item/public.1.fd595bb2.6vS6uTpx4mCssTkw-89kcg'
    }
  }
}
</script>

<style scoped>
  .outer {
    height: 100%;
    width: 100%;
  }
  .header-left {
    display: inline-block;
    text-align: left;
    width: 50%;
  }
  .header-left > span {
    height: 100%;
    margin-right: 10px;
    font-size: xx-large;
  }
  .header-right {
    display: inline-block;
    text-align: right;
    width: 50%;
  }

  .header-right > span {
    font-size: xx-large;
    margin-right: 16px;
    margin-left: 16px;
  }



</style>