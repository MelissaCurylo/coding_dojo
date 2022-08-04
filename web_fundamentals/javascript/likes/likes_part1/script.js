let likeCount = 1;

function onLike (){
    likeCount++;
    console.log(likeCount);
    let elem = document.getElementById("number");
    elem.innerText = likeCount;
}