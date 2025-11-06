package kr.ac.kumoh.s20220968.w10thymeleaf.repository

import kr.ac.kumoh.s20220968.w10thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    private val songs = mutableListOf<Song>(
        Song(1, "Golden", "HUNTR/X"),
        Song(2, "Blue Valentine", "NMIXX"),
        Song(3, "타임캡슐", "다비치"),
    )

    fun findAll(): List<Song> = songs
    fun findById(id: Int): Song? = songs.find { it.id == id }
    fun count(): Long = songs.size.toLong()
}
