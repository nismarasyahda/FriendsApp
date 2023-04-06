package www.smktelkommlg.myfriendapp

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.RowId

@Entity
data class MyFriend (
    @PrimaryKey (autoGenerate = true)
    val temanId: Int? = null,
    val nama : String,
    val kelamin : String,
    val email : String,
    val telp: String,
    val alamat: String
)