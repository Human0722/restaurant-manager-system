<template>
  <div class="header-right">
    <span><i class="el-icon-printer"></i></span>
    <span><i class="el-icon-tickets"></i></span>
    <span><i class="el-icon-question"></i></span>
    <el-avatar :size="32" :src="avatar"></el-avatar>
  </div>
</template>

<script>
export default {
  name: "HeaderRightComponent",
  props: [
    'avatar'
  ],
}
</script>

<style scoped>

.header-right {
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: flex-end;
}

.header-right > span {
  font-size: xx-large;
  margin-right: 16px;
  margin-left: 16px;
}
</style>
