
function validateFname(){
var name=document.getElementById("firstname").value;
	
	if(name==null||name=="")
		{
			document.getElementById("nameerror").innerText="PLEASE PROVIDE NAME";
		}
	else (name.length<40)
		{
			var regx=/^[a-zA-Z\s]+$/;
			
			if(regx.test(name) === false)
				{
					document.getElementById("nameerror").innerText="PLEASE PROVIDE VALID NAME";
				}
			else
				{
					document.getElementById("nameerror").innerText="";
				}
		}
}

function validateLname(){
	var name=document.getElementById("lastname").value;
		
		if(name==null||name=="")
			{
				document.getElementById("lnameerror").innerText="PLEASE PROVIDE NAME";
			}
		else if(name.length<40)
			{
				var regx=/^[a-zA-Z\s]+$/;
				
				if(regx.test(name) === false)
					{
						document.getElementById("lnameerror").innerText="PLEASE PROVIDE VALID NAME";
					}
				else
					{
						document.getElementById("lnameerror").innerText="";
					}
			}
	}

function validateAge(){
	var age=document.getElementById("age").value;
		
		if(age==null||age=="")
			{
				document.getElementById("ageerror").innerText="PLEASE PROVIDE AGE";
			}
		else if(age.length<3)
			{
			var regx=/^[0-9]+$/;
				
				if(regx.test(age) === false)
					{
						document.getElementById("ageerror").innerText="PLEASE PROVIDE VALID AGE";
					}
				else
					{
						document.getElementById("ageerror").innerText="";
					}
			}
	}