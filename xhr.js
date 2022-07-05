import { users, addUsersToHtml, testLogger } from './common.js'

const getSync = document.querySelector('#getSync')
const getAsync = document.querySelector('#getAsync')
const postSync = document.querySelector('#postSync')
const postAsync = document.querySelector('#postAsync')
const test = document.querySelector('#test')

getSync.addEventListener('click', getDataSync)
getAsync.addEventListener('click', getDataAsync)
postSync.addEventListener('click', postDataSync)
postAsync.addEventListener('click', postDataAsync)
test.addEventListener('click', testLogger)

function getDataSync() {
  const xhr = new XMLHttpRequest()
  console.log('UNSENT', xhr.readyState) // readyState will be 0

  xhr.open('GET', 'http://127.0.0.1:3000', false)
  console.log('OPENED', xhr.readyState) // readyState will be 1

  xhr.send()
  console.log('DONE', xhr.readyState) // readyState will be 4

  if (xhr.readyState === 4) {
    if (xhr.status === 200) {
      addUsersToHtml(JSON.parse(xhr.response))
    } else {
      console.log(xhr.status)
    }
  }
}

function getDataAsync() {
  const xhr = new XMLHttpRequest()
  console.log('UNSENT', xhr.readyState) // readyState will be 0

  xhr.open('GET', 'http://127.0.0.1:3000')
  console.log('OPENED', xhr.readyState) // readyState will be 1

  xhr.responseType = 'json'

  xhr.onprogress = function () {
    console.log('LOADING', xhr.readyState) // readyState will be 3
  }

  xhr.onload = function () {
    console.log('DONE', xhr.readyState) // readyState will be 4
    if (xhr.readyState === 4) {
      if (xhr.status === 200) {
        addUsersToHtml(xhr.response)
      } else {
        console.log(xhr.status)
      }
    }
  }

  xhr.send()
}

function postDataSync() {
  const xhr = new XMLHttpRequest()
  console.log('UNSENT', xhr.readyState) // readyState will be 0

  xhr.open('POST', 'http://127.0.0.1:3000', false)
  console.log('OPENED', xhr.readyState) // readyState will be 1

  // xhr.responseType = 'json'
  xhr.setRequestHeader('Content-Type', 'application/json;  charset=utf-8')

  xhr.send(JSON.stringify(users))
  console.log('DONE', xhr.readyState) // readyState will be 4

  if (xhr.readyState === 4) {
    if (xhr.status === 200) {
      addUsersToHtml(JSON.parse(xhr.response))
    } else {
      console.log(xhr.status)
    }
  }
}

function postDataAsync() {
  const xhr = new XMLHttpRequest()
  console.log('UNSENT', xhr.readyState) // readyState will be 0

  xhr.open('POST', 'http://127.0.0.1:3000')
  console.log('OPENED', xhr.readyState) // readyState will be 1

  xhr.responseType = 'json'
  xhr.setRequestHeader('Content-Type', 'application/json;  charset=utf-8')
  xhr.onprogress = function () {
    console.log('LOADING', xhr.readyState) // readyState will be 3
  }

  xhr.onload = function () {
    console.log('DONE', xhr.readyState) // readyState will be 4
    if (xhr.readyState === 4) {
      if (xhr.status === 200) {
        addUsersToHtml(xhr.response)
      } else {
        console.log(xhr.status)
      }
    }
  }

  xhr.send(JSON.stringify(users))
}
