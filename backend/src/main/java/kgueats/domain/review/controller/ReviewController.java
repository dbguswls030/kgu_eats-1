package kgueats.domain.review.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import kgueats.domain.auth.service.AuthService;
import kgueats.domain.member.model.entity.Student;
import kgueats.domain.review.model.dto.ReviewGetDto;
import kgueats.domain.review.model.dto.ReviewPatchDto;
import kgueats.domain.review.model.dto.ReviewPostDto;
import kgueats.domain.review.service.ReviewService;

@RestController
@RequiredArgsConstructor
public class ReviewController {

	private final AuthService authService;
	private final ReviewService reviewService;

	@PostMapping("/reviews/store/{storeId}")
	public ResponseEntity<ReviewGetDto> postReview(
		@PathVariable(value = "storeId") Long storeId,
		@RequestBody ReviewPostDto reviewPostDto) {
		Student student = authService.getAuthStudent();
		return ResponseEntity.ok(reviewService.saveReview(student, storeId, reviewPostDto));
	}

	@PatchMapping("/reviews/{reviewId}")
	public ResponseEntity<ReviewGetDto> updateReview(
		@PathVariable(value = "reviewId") Long reviewId,
		@RequestBody ReviewPatchDto reviewPatchDto) {
		Student student = authService.getAuthStudent();
		return ResponseEntity.ok(reviewService.updateReview(student, reviewId, reviewPatchDto));
	}

	@GetMapping("/reviews/store/{storeId}")
	public ResponseEntity<List<ReviewGetDto>> getReviewList(
		@PathVariable(value = "storeId") Long storeId) {
		return ResponseEntity.ok(reviewService.getReviewList(storeId));
	}

	@GetMapping("/reviews/{reviewId}")
	public ResponseEntity<ReviewGetDto> getReview(
		@PathVariable(value = "reviewId") Long reviewId) {
		return ResponseEntity.ok(reviewService.getReview(reviewId));
	}

	@DeleteMapping("/reviews/{reviewId}")
	public ResponseEntity<String> deleteReview(
		@PathVariable(value = "reviewId") Long reviewId) {
		Student student = authService.getAuthStudent();
		reviewService.deleteReview(student, reviewId);
		return ResponseEntity.ok("is it deleted?");
	}

}
