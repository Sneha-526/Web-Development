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
    document.write(`Please Fill your all details`);
    return false;
  } else {
    if (Email == "") {
      document.write(`Please enter your Email`);
    }
    if (myName == "") {
      document.write(`Please enter your Name`);
    }
    if (PhoneNo == "") {
      document.write(`Please enter your Phone No.`);
    }
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
