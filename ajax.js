//Asynchronous JavaScript And XML

import { users, addUsersToHtml } from './common.js'

const get = document.querySelector('#getAjax')
const post = document.querySelector('#postAjax')

get.addEventListener('click', getData)
post.addEventListener('click', postData)

function getData() {
  console.log('Request is sending now!')
  // $.get('http://127.0.0.1:3000')
  // .done(function(data){ addUsersToHtml(data) })
  // .fail(function(err) {
  //     console.log(err.status)
  // });

  $.ajax({
    type: 'GET',
    url: 'http://127.0.0.1:3000',
    dataType: 'json',
    success: function (data) {
      addUsersToHtml(data)
    },
    error: function (err) {
      console.log(err.status)
    },
  })
}

function postData() {
  console.log('Request is sending now!')
  //for shorthand $.post, we need ajaxSetup to set content type
  // $.ajaxSetup({
  //   contentType: 'application/json; charset=utf-8',
  // })
  // $.post(
  //   'http://127.0.0.1:3000',
  //   JSON.stringify(users))
  //   .done(function(data){ addUsersToHtml(data) })
  //   .fail(function(err) {
  //       console.log(err.status)
  //   });
  $.ajax({
    type: 'POST',
    url: 'http://127.0.0.1:3000',
    data: JSON.stringify(users),
    contentType: 'application/json; charset=utf-8',
    dataType: 'json',
    success: function (data) {
      addUsersToHtml(data)
    },
    error: function (err) {
      console.log(err.status)
    },
  })
}
