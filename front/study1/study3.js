const btn = document.getElementById("addBtn");

document.getElementById("result").addEventListener("click",(event)=>{
    console.log(event.target.classList.contains("remove"));
    console.log(event.target.parentNode);
    if(event.target.classList.contains("remove")){
        event.target.parentNode.remove();
    }
})

btn.addEventListener("click", () => {
    const num = document.querySelectorAll("div>input[type=file]").length;

    if (num >= 5) {
        alert("더 이상 추가할 수 없습니다.");
        return;
    }

    const div = document.createElement("div");

    const input = document.createElement("input");
    input.setAttribute("type", "file");
    
    const span = document.createElement("span");
    //span.addEventListener("click", deleteBtn);
    span.classList.add("remove");
    span.innerText = "X";

    div.appendChild(input);
    div.appendChild(span);

    document.getElementById("result").appendChild(div);

})

function deleteBtn(event){
    event.target.parentElement.remove();
}