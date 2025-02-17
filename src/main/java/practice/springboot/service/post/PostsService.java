package practice.springboot.service.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import practice.springboot.domain.posts.PostRepository;
import practice.springboot.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostRepository postRepository;
    @Transactional
    public Long save(PostsSaveRequestDto requestDto)
    {
        return postRepository.save(requestDto.toEntity()).getId();
    }
}
