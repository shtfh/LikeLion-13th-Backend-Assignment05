package com.likelion.likelioncrud.common.error;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor (access = AccessLevel.PRIVATE)
public enum SuccessCode {
    GET_SUCCESS(HttpStatus.OK, "성공적으로 조회 했습니다."),

    MEMBER_UPDATE_SUCCESS(HttpStatus.OK, "사용자가 성공적으로 수정 되었습니다."),
    POST_UPDATE_SUCCESS(HttpStatus.OK, "게시글이 성공적으로 수정 되었습니다."),
    POST_DELETE_SUCCESS(HttpStatus.OK, "게시글이 성공적으로 삭제 되었습니다."),
    MEMBER_DELETE_SUCCESS(HttpStatus.OK, "사용자가 성공적으로 삭제되었습니다."),

    MEMBER_SAVE_SUCCESS(HttpStatus.CREATED, "사용자가 성공적으로 생성되었습니다."),
    POST_SAVE_SUCCESS(HttpStatus.CREATED, "게시글이 성공적으로 생성되었습니다.");



    private  final HttpStatus httpStatus;
    private  final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
