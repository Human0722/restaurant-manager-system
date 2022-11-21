<template>
  <div class="slf-counter">
    <div class="slf-counter-title">
      <span>用餐人数</span>
      <span><i class="el-icon-close"></i></span>
    </div>
    <div class="slf-counter-monitor">
      <span>{{monitorText}}</span>
    </div>
    <div class="slf-counter-keyboard">
      <div v-on:click="press(1)">1</div>
      <div v-on:click="press(2)">2</div>
      <div v-on:click="press(3)">3</div>
      <div v-on:click="press(4)">4</div>
      <div v-on:click="press(5)">5</div>
      <div v-on:click="press(6)">6</div>
      <div v-on:click="press(7)">7</div>
      <div v-on:click="press(8)">8</div>
      <div v-on:click="press(9)">9</div>
      <div></div>
      <div v-on:click="press(0)">0</div>
      <div v-on:click="press('x')"><i class="el-icon-close"></i></div>
    </div>
    <div class="slf-counter-submit">
      <span>开台并点菜</span>
    </div>
  </div>
</template>

<script>
export default {
  name: "HomePage",
  data() {
    return {
      monitorText: "6",
    };
  },
  methods: {
    press(i) {
      let that = this;
      if (i === 'x') {
        that.monitorText = ''
        return
      }
      if (that.monitorText.length > 2) {
        that.monitorText = ''
        return
      }
      if (that.monitorText.startsWith('0')) {
        that.monitorText = that.monitorText.substring(1)
      }
      that.monitorText = that.monitorText + i;

    }
  }
}
</script>

<style scoped>
  .slf-counter {
    background-color: white;
    width: 400px;
    box-sizing: border-box;
    display: flex;
    flex-direction: column;
    align-items: center;
  }
  .slf-counter-title {
    position: relative;
    width: 100%;
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: center;

    margin-top: 1rem;
    font-weight: 900;

  }
  .slf-counter-title>span:nth-child(2) {
    font-size: 2rem;
    display: block;
    position: absolute;
    right: 0px;
  }
  .slf-counter-monitor {
    height: 3rem;
    width: 90%;
    border-radius: 0.5rem;
    border: solid red 1px;

    display: flex;
    justify-content: center;
    align-items: center;

    font-size: 3rem;
    margin-top: 1rem;
    margin-bottom: 1rem;
  }
  .slf-counter-keyboard {
    width: 100%;

    display: flex;
    flex-direction: row;
    flex-wrap: wrap;

  }
  .slf-counter-keyboard>div {
    box-sizing: border-box;
    flex: 0 0 33.3%;
    aspect-ratio: 2.2/1;
    border: solid 1px #d9d9d9;

    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 2rem;
  }

  .slf-counter-submit {
    width: 100%;
    height: 3rem;
    background-color: red;
    color: white;

    display: flex;
    justify-content: center;
    align-items: center;
  }


</style>
