package com.SpEEdysm1des.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpEEdysm1des.model.VideoModel;
import com.SpEEdysm1des.service.StreamingService;
import com.SpEEdysm1des.service.VideosBusinessServiceInterface;

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
	
	private final StreamingService service;
	
@GetMapping("/")
public List<VideoModel> showAllVideos()
{	
	List<VideoModel> videos = VideoService.getVideos();
	return videos;
}

	@GetMapping(value = "/{title}", produces = "video/mp4")
	public Mono<Resource> getVideo(@PathVariable String title){
		System.out.println("range in bytes(): " + 0);
		return service.getVideo(title);
	}
}

