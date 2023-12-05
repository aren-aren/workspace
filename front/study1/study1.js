let printInfo = function(){
    let userName = document.getElementById("user_name").value;
    let userAge = document.getElementById("user_age").value;
    let userGender = document.querySelector("input[name=user_gender]:checked").value;
    let userHeight = Number(document.getElementById("user_height").value);
    let userWeight = document.getElementById("user_weight").value;

    console.log("이름 : " + userName);
    console.log("나이 : " + userAge);
    console.log("성별 : " + userGender);
    console.log("키 : " + userHeight);
    console.log("몸무게 : " + userWeight);
    console.log("result : " + (userHeight+100));
}

document.getElementById("btn").addEventListener("click",printInfo);