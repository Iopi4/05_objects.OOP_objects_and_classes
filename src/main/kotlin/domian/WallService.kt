package ru.netology.domian

/**
 * Этот объект (синглтон) будет хранить массив (список) постов.
 * Используем mutableListOf, так как он позволяет добавлять элементы (в отличие от listOf)
 */

object WallService {
    //Хранилище постов
    private val posts = mutableListOf<Post>()

    //создадим счетчик постов и будем присваивать каждому свой ID
    private var nextId = 1

    //метод для добавления поста
    fun addPost (post: Post): Post {
        //Присваиваем идентификатор по порядку
        val newPost = post.copy(id = nextId++)
        posts.add(newPost)
        return newPost
    }

    //Метод для просмотра постов
    fun printPosts(){
        posts.forEach { println(it) }
    }

    //Метод для получения списка постов
    fun getPosts (): List<Post> = posts.toList()
}