document.addEventListener('DOMContentLoaded',()=>{
const btn = document.getElementById('btn');
const increaseAge =document.getElementById("increaseAge");
const ageItem = document.getElementById("ageItem");
const addAHobby = document.getElementById("addAHobby");
const user = document.getElementById("userName");
const hobbyInput = document.getElementById("hobbyInput");
const resetincreaseAge = document.getElementById("resetIncreaseAge");
const infoList = document.getElementById("infoList");

let currentAge = 25;

btn.addEventListener('click', () => {
  alert(`Отправить письмо на anna.ivanova@example.com?`);
});

increaseAge.addEventListener('click',() =>{
    currentAge++;
    ageItem.textContent = `Возраст: ${currentAge}  лет`;
})

resetincreaseAge.addEventListener('click',()=>{
    currentAge = 25;
    ageItem.textContent = `Возраст: ${currentAge}  лет`;
})


addAHobby.addEventListener('click',()=>{
   const hobby = hobbyInput.value.trim();
    if(hobby=== ''){
        alert('введите хобби')
    }else {
        const li = document.createElement('li');
        li.textContent =`Хобби:${hobby}`;
        li.classList.add('hobby');
        infoList.appendChild(li);
    }
})

user.addEventListener('mouseover',()=>{
    user.style.color = "blue";
})
user.addEventListener('mouseout',()=>{
    user.style.color ="";
})





})