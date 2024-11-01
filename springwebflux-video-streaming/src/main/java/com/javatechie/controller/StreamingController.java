package com.javatechie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.models.VideoModel;
import com.javatechie.service.StreamingService;
import com.javatechie.service.VideosBusinessServiceInterface;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
@RequestMapping("video")
public class StreamingController {
	
	@Autowired
	VideosBusinessServiceInterface VideoService;
	
	private final StreamingService service = new StreamingService();
	
@GetMapping("/")
public List<VideoModel> showAllVideos()
{	
	List<VideoModel> videos = VideoService.getVideos();
	return videos;
}

	@GetMapping(value = "/{title}", produces = "video/mp4")
	public Mono<Resource> getVideo(@PathVariable String title,@RequestHeader("Range") String range){
		System.out.println("range in bytes(): " + range);
		return service.getVideo(title);
	}
}

