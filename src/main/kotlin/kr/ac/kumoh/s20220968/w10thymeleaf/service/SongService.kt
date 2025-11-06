package kr.ac.kumoh.s20220968.w10thymeleaf.service

import kr.ac.kumoh.s20220968.w10thymeleaf.model.Song
import kr.ac.kumoh.s20220968.w10thymeleaf.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService {
    private val repository: SongRepository = SongRepository()
    /**
     * 모든 노래 리스트 얻음
     */
    fun getAll(): List<Song> = repository.findAll()

    /**
     * id와 일치하는 노래 얻음
     */
    fun findById(id: Int): Song? = repository.findById(id)

    /**
     * 랜덤으로 노래 한 곡 얻음
     * - **NOTE:** 리스트가 많을 때는 성능 저하 우려
     */
    fun getRandomSong() = repository.findAll().randomOrNull()

}