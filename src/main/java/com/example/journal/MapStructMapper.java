package com.example.journal;

import com.example.journal.model.dao.AttendanceDao;
import com.example.journal.model.dao.FacultyDao;
import com.example.journal.model.dao.GroupDao;
import com.example.journal.model.dao.StudentDao;
import com.example.journal.model.dao.SubjectDao;
import com.example.journal.model.dao.TutorDao;
import com.example.journal.model.dto.AttendanceDto;
import com.example.journal.model.dto.FacultyDto;
import com.example.journal.model.dto.GroupDto;
import com.example.journal.model.dto.StudentDto;
import com.example.journal.model.dto.SubjectDto;
import com.example.journal.model.dto.TutorDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

  MapStructMapper MAPPER = Mappers.getMapper(MapStructMapper.class);

  AttendanceDao attendanceDtoToDao(AttendanceDto dto);
  AttendanceDto attendanceDaoToDto(AttendanceDao dao);

  FacultyDao facultyDtoToDao(FacultyDto dto);
  FacultyDto facultyDaoToDto(FacultyDao dao);

  GroupDao groupDtoToDao(GroupDto dto);
  GroupDto groupDaoToDto(GroupDao dao);

  StudentDao studentDtoToDao(StudentDto dto);
  StudentDto studentDaoToDto(StudentDao dao);

  SubjectDao subjectDtoToDao(SubjectDto dto);
  SubjectDto subjectDaoToDto(SubjectDao dao);

  TutorDao tutorDtoToDao(TutorDto dto);
  TutorDto tutorDaoToDto(TutorDao dao);


}
