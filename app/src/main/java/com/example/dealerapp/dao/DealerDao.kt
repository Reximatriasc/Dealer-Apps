package com.example.dealerapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.dealerapp.model.Dealer
import kotlinx.coroutines.flow.Flow

interface DealerDao {
    @Dao
    interface DealerDao
        @Query("SELECT * FROM  `dealer_table` ORDER BY name ASC")
        fun getAllDealer(): Flow<List<Dealer>>

        @Insert
        suspend fun insertDealer(dealerDao: Dealer)

        @Delete
        suspend fun deleteDealer(dealerDao: Dealer)

        @Update
        fun updateDealer(dealer: Dealer)


    }