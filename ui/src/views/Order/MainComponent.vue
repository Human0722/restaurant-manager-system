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
        <div class="slf-main-detail-content-item">
          <span>王老吉</span>
          <span>x1</span>
          <span>￥5</span>
        </div>
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
      <div class="slf-main-content-item-container">
        <div class="slf-main-content-item">
          <span>
          <el-badge class="mark" :value="12">黑土地(红)
          </el-badge>
          </span>
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
          <span>￥50 ~ ￥80</span>
        </div>
        <div class="slf-main-content-item">
          <span><i class="el-icon-plus"></i></span>
          <span>添加菜品</span>
        </div>
      </div>
      <div class="slf-main-menu">
        <span class="slf-main-menu-selected">
        <el-badge class="mark" :value="12">
          <span>全部</span>
        </el-badge>
        </span>
        <span>
        <el-badge class="mark" :value="12">
          <span>全部</span>
        </el-badge>
        </span>
        <span>牛肉火锅</span>
        <span>羊肉火锅</span>
        <span>酒水饮料</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "MainComponent"
}
</script>

<style scoped>
  .slf-main {
    flex-grow: 1;

    display: flex;
    flex-direction: row;
  }
  .slf-main-detail {
    flex: 0 0 26.36%;
    border-top: 2px solid #d9d9d9;
    border-right: 2px solid #d9d9d9;

    display: flex;
    flex-flow: column nowrap;
  }
  .slf-main-detail-header {
    font-size: 1.2rem;
    font-weight: 900;

    border-bottom: 2px solid #d9d9d9;
    height: 90px;

    display: flex;
    flex-flow: row nowrap;
    justify-content: space-between;
    align-items: center;
  }
  .slf-main-detail-header>span:nth-child(1) {
    margin-left: 1rem;
  }
  .slf-main-detail-header>span:nth-child(2) {
    margin-right: 1rem;
  }
  .slf-main-detail-content {
    flex-basis:  100%;
    overflow: auto;

    display: flex;
    flex-flow: column nowrap;

  }
  .slf-main-detail-content-item {
    display: flex;
    flex-direction: row;
    align-items: center;
    border-bottom: white solid 1px;

    background-color: #d9d9d9;
    height: 50px;
    font-size: 1rem;
    font-weight: 800;
  }
  .slf-main-detail-content-item>span:nth-child(1) {
    flex: 0 0 20%;
  }
  .slf-main-detail-content-item>span:nth-child(2) {
    flex: 0 0 55%;
  }
  .slf-main-detail-content-item>span:nth-child(3) {
    flex:  0 0 25%;
  }

  .slf-main-detail-submit {
    border-top: solid 1px #d9d9d9;
  }

  .slf-main-detail-submit-total {
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
    align-items: center;
  }
  .slf-main-detail-submit-total>span:nth-child(1) {
    color: gray;
    margin-right: 1rem;
  }
  .slf-main-detail-submit-total>span:nth-child(2) {
    color: orangered;
    font-size: 1.5rem;
    margin-right: 1rem;
  }
  .slf-main-detail-submit-total>.el-button {
    margin-bottom: 1rem;
  }


  .slf-main-operate {
    flex: 0 0 5%;
    border-top: solid 2px #d9d9d9;
    border-right: solid 2px #d9d9d9;

    display: flex;
    flex-direction: column;
    justify-content: space-around;
  }
  .slf-main-content {
    flex: 0 0 60%;
    background-color: #d9d9d9;

    display: flex;
    flex-flow: row nowrap;
  }
  .slf-main-content-item-container {
    flex: 0 0 100%;

    box-sizing: border-box;
    border-top: solid #d9d9d9 2px;

    display: flex;
    flex-wrap: wrap;
    overflow: auto;
    align-content: flex-start;
  }

  .slf-main-content-item {
    background-color: white;
    box-sizing: border-box;
    aspect-ratio: 1 / 1;
    flex: 0 0 20%;
    border-left: 5px solid #d9d9d9;
    border-right: 5px solid #d9d9d9;
    border-bottom: 10px solid #d9d9d9;
    padding-top: 1rem;

    display: flex;
    flex-direction: column;
    align-items: flex-start;
    padding-left: 1rem;
  }
  .slf-main-content-item>span:nth-child(1) {
    font-size: 2rem;
  }
  .slf-main-content-item>span:nth-child(2) {
    font-size: 1rem;
  }

  .slf-main-menu {
    flex: 0 0 16%;
    border-top: solid #d9d9d9 2px;

    display: flex;
    flex-direction: column;
    flex-wrap: nowrap;
    justify-content: flex-start;
    overflow: auto;
  }
  .slf-main-menu>span {
    height: 3rem;
    line-height: 3rem;
    font-size: 1.2rem;
    font-weight: 400;
    margin-top: 1rem;
  }
  .slf-main-menu-selected {
    background-color: #d9d9d9;
  }
  .badge {
    background-color: red;
    position: absolute;
    right: 0px;
  }
</style>
