package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author XIAO JIN
 * @date 2021/04/28/ 15:06
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
