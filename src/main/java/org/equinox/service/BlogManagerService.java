package org.equinox.service;

import org.equinox.model.dto.CreateBlogManagerDTO;
import org.equinox.model.dto.ManagedBlogDTO;
import org.equinox.model.dto.ManagedBlogWithBlogDTO;
import org.equinox.model.dto.ManagedBlogWithUserDTO;
import org.equinox.model.dto.UpdateBlogManagerDTO;

import java.util.List;

public interface BlogManagerService {
    ManagedBlogDTO save(CreateBlogManagerDTO createBlogManagerDTO);
    ManagedBlogDTO update(Long id, UpdateBlogManagerDTO updateBlogManagerDTO);
    void delete(Long id);
    ManagedBlogDTO findById(Long id);
    List<ManagedBlogWithBlogDTO> findByUser(Long id, int page, int pageSize, String sortingDirection, String sortBy);
    List<ManagedBlogWithUserDTO> findByBlog(Long id, int page, int pageSize, String sortingDirection, String sortBy);
    List<ManagedBlogDTO> findByBlogAndUser(Long blogId, Long userId);
}
