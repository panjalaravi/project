package com.app.service;

import java.util.List;

import com.app.model.UploadFile;

public interface IFileUploadService {

	public void saveUploadFile(UploadFile file);

	public List<Object[]> getFileIdAndNames();

	public UploadFile getFileObjById(int fileId);

}
