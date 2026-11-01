package ru.netology

import ru.netology.domian.Likes
import ru.netology.domian.Post
import ru.netology.domian.WallService

fun main() {
    //Создадим пробный пост
    val firstPost = Post(
        fromId = 1,
        text = "Пустой пост",
        likes = Likes(count = 5), //добавим 5 лайков.
    )

    //Теперь используем сервис для добавления поста на стену
    val addedPost = WallService.addPost(firstPost)

    //Выведем результат в консоль
    println("Добавлен пост с ID: ${addedPost.id}")
    println("Текст поста: ${addedPost.text}")
    println("Количество лайков: ${addedPost.likes}")

    //Выведем все добавленные посты
    WallService.printPosts()
}