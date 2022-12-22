
var num1,num2;
 
function func_add()
{
    num1=parseInt( document.getElementById("num1").value);
    num2=parseInt( document.getElementById("num2").value);
    document.getElementById("result").innerHTML=num1+num2;
}
function func_subtract()
{
    num1=parseInt( document.getElementById("num1").value);
    num2=parseInt( document.getElementById("num2").value);
    document.getElementById("result").innerHTML=num1-num2;
}
function func_multiply()
{
    num1=parseInt( document.getElementById("num1").value);
    num2=parseInt( document.getElementById("num2").value);
    document.getElementById("result").innerHTML=num1*num2;
}
function func_divide()
{
    num1=parseInt( document.getElementById("num1").value);
    num2=parseInt( document.getElementById("num2").value);
    document.getElementById("result").innerHTML=num1/num2;
}
    