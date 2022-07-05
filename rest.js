const getSync = document.querySelector("#getSync");
const getAsync = document.querySelector("#getAsync");
const postSync = document.querySelector("#postSync");
const postAsync = document.querySelector("#postAsync");
const test = document.querySelector("#test");

getSync.addEventListener("click", getDataSync);
getAsync.addEventListener("click", getDataAsync);
postSync.addEventListener("click", postDataSync);
postAsync.addEventListener("click", postDataAsync);
test.addEventListener("click", testLogger);

const users = [
	{
		email: "yossi.arye@reqres.in",
		first_name: "Yossi",
		last_name: "Arye",
		avatar: "https://reqres.in/img/faces/1-image.jpg",
	},
	{
		email: "israel.israeli@reqres.in",
		first_name: "Israel",
		last_name: "Israeli",
		avatar: "https://reqres.in/img/faces/1-image.jpg",
	},
	{
		email: "john.doe@reqres.in",
		first_name: "John",
		last_name: "Doe",
		avatar: "https://reqres.in/img/faces/1-image.jpg",
	},
];

function getDataSync() {
	const xhr = new XMLHttpRequest();
	console.log("UNSET", xhr.readyState);

	xhr.open("GET", "http://localhost:3000", false);
	console.log("OPENED", xhr.readyState);

	xhr.send();
	if (xhr.status === 200) {
		addUsersToHtml(JSON.parse(xhr.response));
	} else {
		console.log(xhr.status);
	}
}

function getDataAsync() {
	const xhr = new XMLHttpRequest();
	console.log("UNSET", xhr.readyState);

	xhr.open("GET", "http://localhost:3000");
	console.log("OPENED", xhr.readyState);

	xhr.onprogress = function () {
		console.log("LOADING", xhr.readyState);
	};

	xhr.onload = function () {
		if (xhr.status === 200 && xhr.readyState === 4) {
			console.log("DONE", xhr.readyState);
			addUsersToHtml(JSON.parse(xhr.response));
		} else {
			console.log(xhr.status);
		}
	};

	xhr.send();
	console.log("Ofir");
}

function postDataSync() {
	const xhr = new XMLHttpRequest();
	xhr.open("POST", "http://localhost:3000", false);

	xhr.setRequestHeader("Content-type", "application/json; charset=UTF-8");

	xhr.send(JSON.stringify(users));
	if (xhr.status === 200) {
		addUsersToHtml(JSON.parse(xhr.response));
	} else {
		console.log(xhr.status);
	}
}

function postDataAsync() {
	const xhr = new XMLHttpRequest();
	xhr.open("POST", "http://localhost:3000");

	xhr.setRequestHeader("Content-type", "application/json; charset=UTF-8");

	xhr.onload = function () {
		if (xhr.status === 200) {
			addUsersToHtml(JSON.parse(xhr.response));
		} else {
			console.log(xhr.status);
		}
	};

	xhr.send(JSON.stringify(users));
	console.log("Ofir");
}

function testLogger() {
	console.log("I'm handled now!");
}

function addUsersToHtml(users) {
	console.log(users);
	const ul = document.querySelector("#users");
	ul.innerHTML = "";
	for (const user of users) {
		const li = document.createElement("li");
		li.innerHTML = `Full Name: <b>${user.first_name} ${user.last_name}</b>, Email: <b>${user.email}</b>`;
		ul.appendChild(li);
	}
}
