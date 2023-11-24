package com.daveace.qrnavigationapp.data

import android.os.Build
import androidx.annotation.RequiresApi
import com.daveace.qrnavigationapp.data.NoArgs.Companion.newInstance
import java.time.LocalDateTime
@RequiresApi(Build.VERSION_CODES.O)
data class Event(
    val id: Int = 0,
    val name: String = "",
    val description: String = "",
    val organizer: Organization = newInstance(Organization::class),
    val start: LocalDateTime = LocalDateTime.now(),
    val end: LocalDateTime = LocalDateTime.now(),
    val imageURL: String,
    val venues: List<Venue> = emptyList()
)