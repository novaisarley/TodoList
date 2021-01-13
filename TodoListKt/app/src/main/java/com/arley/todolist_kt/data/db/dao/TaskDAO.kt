package com.arley.todolist_kt.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.arley.todolist_kt.data.db.entity.TaskEntity

@Dao
interface TaskDAO {
    @Insert
    suspend fun insert(task: TaskEntity): Long

    @Update
    suspend fun update(task: TaskEntity)

    @Query("DELETE FROM task WHERE id = :id")
    suspend fun delete(id: Long)

    @Query("DELETE FROM task")
    suspend fun deleteAll()

    @Query("SELECT * FROM task")
    fun getAll(): LiveData<List<TaskEntity>>

}