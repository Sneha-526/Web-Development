"use strict";
function myFunction() {
  var myName = document.forms["myForm"]["name"].value;
  var Email = document.forms["myForm"]["email"].value;
  var PhoneNo = document.forms["myForm"]["number"].value;
  var msg1 = document.forms["myForm"]["msg1"].value;
  var msg2 = document.forms["myForm"]["msg2"].value;
  var msg3 = document.forms["myForm"]["msg3"].value;
  var msg4 = document.forms["myForm"]["msg4"].value;

  if (myName == "" && Email == "" && PhoneNo == "") {
    alert(`Please Fill your all details`);
    return false;
  }
  if (Email == "") {
    alert(`Please enter your Email`);
    return false;
  }
  if (myName == "") {
    alert(`Please enter your Name`);
    return false;
  }
  if (PhoneNo == "") {
    alert(`Please enter your Phone No.`);
    return false;
  }

  if (PhoneNo.length < 9) {
    document.write("Phone No. is invalid");
    return false;
  }

  //using string tempalets.

  document.write(`${myName}, you have successfully entered your form.<br>
        kindly check your details:<br>
        Email= ${Email}<br>
        Phone No.= ${PhoneNo}<br>
        `);

  // using ternary operator.

  document.write(
    msg1 == "" && msg2 == "" && msg3 == "" && msg4 == ""
      ? `No Message is given by you`
      : `The Message given by you is <ul><li>${msg1}</li><li>${msg2}</li><li>${msg3}</li><li>${msg4}</li</ul>`
  );
  return false;
}
