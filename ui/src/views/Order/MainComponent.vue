<template>
  <div class="slf-main">
    <div class="slf-main-detail">
      <div class="slf-main-detail-header">
        <span>桌台1,人数4/4</span>
        <span><i class="el-icon-delete"></i> 清空</span>
      </div>
      <div class="slf-main-detail-content">
        <div class="slf-main-detail-content-item">
          <span>王老吉</span>
          <span>x1</span>
          <span>￥5</span>
        </div>
      </div>
      <div class="slf-main-detail-submit">
        <div class="slf-main-detail-submit-total">
          <span>共1项</span>
          <span>￥5</span>
        </div>
        <el-button type="danger" plain>下单并结账</el-button>
        <el-button type="danger">下单</el-button>
      </div>
    </div>
    <div class="slf-main-operate">
      <span><el-button icon="el-icon-plus" circle></el-button></span>
      <span>1</span>
      <span><el-button icon="el-icon-minus" circle></el-button></span>
      <span>规格/做法</span>
      <span>加料</span>
      <span>备注</span>
      <span>删除</span>
    </div>
    <div class="slf-main-content">
      <div class="slf-main-content-item">
        <span>黑土地(红)</span>
        <span>￥50</span>
      </div>
      <div class="slf-main-content-item">
        <span>黑土地(红)</span>
        <span>￥50</span>
      </div>
      <div class="slf-main-content-item">
        <span>黑土地(红)</span>
        <span>￥50</span>
      </div>
    </div>
    <div class="slf-main-menu">
      <span>全部</span>
      <span>牛肉火锅</span>
      <span>羊肉火锅</span>
      <span>酒水饮料</span>
    </div>
  </div>
</template>

<script>
export default {
  name: "MainComponent"
}
</script>

<style scoped>
  div {
    border: solid 1px red;
  }
  .slf-main {
    flex-grow: 1;

    display: flex;
    flex-direction: row;
  }
  .slf-main-detail {
    flex: 0 0 36.36%;

    display: flex;
    flex-flow: column nowrap;
  }
  .slf-main-detail-header {
    font-size: 1.5rem;
  }
  .slf-main-operate {
    flex: 0 0 9.1%;
  }
  .slf-main-content {
    flex: 0 0 45.45%;
  }
  .slf-main-menu {
    flex: 0 0 9.1%;
  }
</style>
