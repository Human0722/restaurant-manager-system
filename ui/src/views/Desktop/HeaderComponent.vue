<template>
  <div class="outer">
    <div class="header-left">
      <span><i class="el-icon-menu"></i></span>
      <span>桌台</span>
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
  .header-right {
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
  }

  .header-right > span {
    font-size: xx-large;
    margin-right: 16px;
    margin-left: 16px;
  }



</style>