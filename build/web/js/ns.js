/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var quiz;
var time=50;
var current=0;

function timer(val){
    console.log(val);
 time=val;
   asdf();
 }
 function asdf(){
      time=time-1;
    $("#timer").text(time);
    setTimeout(asdf,1000);
 }


