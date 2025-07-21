package Interfaces;
import Entity.*;

import java.util.Scanner;

public interface ITeacherList{
	void insert(Student b);
	void deleteById(String id);
	void getById(String id);
}