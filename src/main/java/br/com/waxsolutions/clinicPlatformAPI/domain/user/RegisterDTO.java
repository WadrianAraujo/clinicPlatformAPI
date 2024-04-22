package br.com.waxsolutions.clinicPlatformAPI.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
