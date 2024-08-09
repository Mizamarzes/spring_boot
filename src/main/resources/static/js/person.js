
async function getPerson(){
    const nroIdentification = document.getElementById('nroIdentification').value;
    const url = `http://localhost:8090/api/getPersonByNroIdentification/${nroIdentification}`;
    try {
        const response = await fetch(url);
        if(!response.ok){
            throw new Error("Error with the network connection")
        }
        const person = await response.json();
        console.log(JSON.stringify(person,null,2));
        document.getElementById('result').innerText = JSON.stringify(person,null,2);
    } catch (error) {
        document.getElementById('result').innerText = `Error: ${error.message}`;
    }
}