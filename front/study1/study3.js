const btn = document.getElementById("addBtn");
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
    span.addEventListener("click", deleteBtn);
    span.innerText = "X";

    div.appendChild(input);
    div.appendChild(span);

    document.getElementById("result").appendChild(div);

})

function deleteBtn(event){
    event.target.parentElement.remove();
}