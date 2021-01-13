package com.arley.todolist_kt.repository

import androidx.lifecycle.LiveData
import com.arley.todolist_kt.data.db.entity.TaskEntity

interface TaskRepository {

    suspend fun insertSubscriber(title: String, description: String): Long

    suspend fun updateSubscriber(id: Long, title: String, description: String)

    suspend fun deleteSubscriber(id: Long)

    suspend fun deleteAllSubscribers()

    suspend fun getAllSubscribers(): LiveData<List<TaskEntity>>
}