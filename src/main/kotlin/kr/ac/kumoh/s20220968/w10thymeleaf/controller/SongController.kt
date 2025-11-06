package kr.ac.kumoh.s20220968.w10thymeleaf.controller

import kr.ac.kumoh.s20220968.w10thymeleaf.service.SongService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController
    (private val service: SongService){
    @GetMapping("/songs/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute("song",  service.getRandomSong())
        return "random"
    }
}