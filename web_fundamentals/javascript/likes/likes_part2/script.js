let likeCounts = [9, 12, 9];

function onLike(index) {
    debugger;
    if (index >= likeCounts.length)
        return;
        likeCounts[index]+=1;
        let elem = document.getElementById("number" + index);
        elem.innerText = likeCounts[index];


}