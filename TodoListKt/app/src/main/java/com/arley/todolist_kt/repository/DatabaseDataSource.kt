package com.arley.todolist_kt.repository

import androidx.lifecycle.LiveData
import com.arley.todolist_kt.data.db.dao.TaskDAO
import com.arley.todolist_kt.data.db.entity.TaskEntity

class DatabaseDataSource(
    private val taskDAO: TaskDAO
) : TaskRepository{

    override suspend fun insertSubscriber(title: String, description: String): Long {
        return taskDAO.insert(TaskEntity(title = title, description = description))
    }

    override suspend fun updateSubscriber(id: Long, title: String, description: String) {
        taskDAO.update(TaskEntity(id, title, description))
    }

    override suspend fun deleteSubscriber(id: Long) {
        taskDAO.delete(id)
    }

    override suspend fun deleteAllSubscribers() {
        taskDAO.deleteAll()
    }

    override suspend fun getAllSubscribers(): LiveData<List<TaskEntity>> {
        return taskDAO.getAll()
    }

}