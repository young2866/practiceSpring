package spring.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/")
    public String list(Model model) {
        List<BoardDto> boardDtoList = boardService.getBoardList();
        model.addAttribute("boardList", boardDtoList);
        return "list";
    }

    @GetMapping("/write")
    public String write() {
        return "write";
    }

    @PostMapping("/write")
    public String write(BoardDto dto) {
        boardService.savePost(dto);
        return "redirect:/";
    }
}
