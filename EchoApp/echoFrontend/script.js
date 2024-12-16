const serverBox = document.getElementById("serverAddress");
const messageBox = document.getElementById("message");
const sendButton = document.getElementById("send");

sendButton.addEventListener("click", function() {
    console.log("Click!");
    document.getElementById("server_output").innerHTML = "Server echos: "

    fetch(serverBox.value, {
        method:"POST",
        body: JSON.stringify({
            input: messageBox.value,
            stamp: {
                device:"client_out",
                stamp: new Date()
            }
        }),
        headers:{
            "Content-Type":"application/json"
        }
    })
    .then(response => response.json())
    .then(json => {
        clientInTime = new Date();

        let jsonText = '{ "device":"client_in", "stamp":"' + clientInTime.toISOString() + '"}';
        console.log(jsonText);
        const jsonObj = JSON.parse(jsonText);

        console.log(json);
        console.log(jsonObj);

        document.getElementById("server_output").innerHTML += json.message;

        timestamps = json.stamps;
        timestamps.push(jsonObj);

        for(let i = 0; i < timestamps.length; i++)
        {
            document.getElementById("stamp" + i).innerHTML = timestamps[i].device + ": " + timestamps[i].stamp;
        }
    });
});