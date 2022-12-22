const incrementCount = document.getElementById("increment-value");
const decrementCount = document.getElementById("decrement-value");
const totalCount = document.getElementById("total-count");
var count = 0;
totalCount.innerHTML = count;
const Func_Increment = () => {
  count++;
  totalCount.innerHTML = count;
};
const Func_Decrement = () => {
  count--;
  totalCount.innerHTML = count;
};
incrementCount.addEventListener("click", Func_Increment);
decrementCount.addEventListener("click", Func_Decrement);