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
    time = new Date(val)-new Date();
    
    
   asdf();
 }
 function asdf(){
      time=time-1;
        
    $("#timer").text(Math.floor((time/60000))+" Min");
    setTimeout(asdf,1000);
 }

function read(val){

                var outString = "Read.jsp?x1=" + val
                 console.log(val);
                     location.href = outString
}
function read1(val){

                var outString = "Read_Admin.jsp?x1=" + val
                 console.log(val);
                     location.href = outString
}
