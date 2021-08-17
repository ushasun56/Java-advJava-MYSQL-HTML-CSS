function handlesubmit()
{
    const name = document.getElementById('name').Value;
    const surname = document.getElementById('surname').Value;
    localStorage.setItem("NAME",name);
    localStorage.setItem("SURNAME",surname);
    return;
}