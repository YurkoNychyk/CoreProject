/*
 It is my javascript-"hello world"
 1234 5687 8954 5565 - valid number for Luhn Algorithm
*/
function validate(val) {
	if (val.trim().length==0) {
		document.getElementById('warningText').innerHTML = "";
		return;
	}
	
	var number= val.split(' ').join('');
	for (var i = 0; i < number.length; i++) {
		if (number.charAt(i) < '0' || number.charAt(i) > '9') {
			document.getElementById('warningText').innerHTML = 'Card number should contain only numeric symbols!';
			return;
		}
	}

	document.getElementById('warningText').innerHTML = "";
	var str = "";
    for (var i = 0; i < number.length; i++) {
    	str+=number.charAt(i);
    	if ( ((i+1)%4==0) && ((i+1)!=number.length) ) str+=" ";
    }
    document.getElementById('inputNumber').value = str;
	
	//validation (Luhn Algorithm)
	if (number.length == 16) { 		
		var sum = 0, digit = 0, even = false;
		for (var i = number.length - 1; i >= 0; i--) {
			digit = parseInt(number.charAt(i), 10);
			if (even) {
				if ((digit *= 2) > 9) digit -= 9;
			}
			sum += digit;
			even = !even;//парний-непарний елементи
		}
		var result = "";
		if ((sum % 10) == 0) {
			 result = "valid";
		 } else result ="not valid";
				
		document.getElementById('warningText').innerHTML = "Your card is "+result;
	}
}
