<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Hello, World!</title>
    <style>
    *{
      background-color:#FFEFD5;
    }
      #recome{
        text-align:center;
        width:100%;
        color: #DA70D6;
      }
      h2{
        
        color: #6B8E23;
        text-align:center;
      }
       .button {
  padding: 10px 15px;
  font-size: 14px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: #04AA6D;
  border: none;
  border-radius: 5px;
  
}
.button:hover {background-color: red}
    </style>
  </head>
  <body>
    <div id="recome">
      <h2>Registration Form</h2>
     <form autocomplete="off" action="customerserve" method="post">
       <div>
       <label>AdhaarNo :</label>
       <input type="text" name="ad" class="adhaarsouce" placeholder="xxxx xxxx xxxx" required>
       </div>
       <br>
       <div>
       <label>Age :</label>
       <input type="number" name="ag" class="agesouce" placeholder="Enter Age" required>
       </div>
       <br>
       <div>
       <label>City :</label>
       <input type="text" name="ci" class="citysouce" placeholder="Enter city" required>
       </div>
       <br>
       <div>
       <label>Name :</label>
       <input type="text" name="na" class="namesouce" placeholder="Enter Name" required>
       </div>
       <br>
       <div>
       <label>Phone No :</label>
       <input type="text" name="phno" class="phnosouce" placeholder="+91 7777777333" required>
       </div>
       <br>
       
       <button class="button">Submit</button>
       
     </form>
     </div >
     
  </body>
</html>