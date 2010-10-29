package polylib;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


class PolylibJNI {
  public final static native long stdin_get();
  public final static native long stdout_get();
  public final static native long stderr_get();
  public final static native int printf(String jarg1);
  public final static native int POLYLIB_BITS_get();
  public final static native long __LONG_LONG_MAX___get();
  public final static native long LONG_LONG_MAX_get();
  public final static native long LONG_LONG_MIN_get();
  public final static native java.math.BigInteger ULONG_LONG_MAX_get();
  public final static native String LINEAR_VALUE_STRING_get();
  public final static native String VALUE_FMT_get();
  public final static native int VALUE_ZERO_get();
  public final static native int VALUE_ONE_get();
  public final static native int VALUE_MONE_get();
  public final static native long overflow_error_get();
  public final static native long simplex_arithmetic_error_get();
  public final static native long user_exception_error_get();
  public final static native long parser_exception_error_get();
  public final static native long any_exception_error_get();
  public final static native long the_last_just_thrown_exception_get();
  public final static native void dump_exception_stack_to_file(long jarg1);
  public final static native void dump_exception_stack();
  public final static native long push_exception_on_stack(int jarg1, String jarg2, String jarg3, int jarg4);
  public final static native void pop_exception_from_stack(int jarg1, String jarg2, String jarg3, int jarg4);
  public final static native void throw_exception(int jarg1, String jarg2, String jarg3, int jarg4);
  public final static native String __CURRENT_FUNCTION_NAME___get();
  public final static native char FIRST_PARAMETER_NAME_get();
  public final static native char PCHAR_get();
  public final static native int MAXNOOFRAYS_get();
  public final static native String P_VALUE_FMT_get();
  public final static native int LB_INFINITY_get();
  public final static native int UB_INFINITY_get();
  public final static native int Pol_status_get();
  public final static native long Vector_Size_get(long jarg1);
  public final static native long Vector_p_get(long jarg1);
  public final static native long new_Vector();
  public final static native void delete_Vector(long jarg1);
  public final static native long Matrix_NbRows_get(long jarg1);
  public final static native long Matrix_NbColumns_get(long jarg1);
  public final static native long Matrix_p_get(long jarg1);
  public final static native long Matrix_p_Init_get(long jarg1);
  public final static native int Matrix_p_Init_size_get(long jarg1);
  public final static native long new_Matrix();
  public final static native void delete_Matrix(long jarg1);
  public final static native long Polyhedron_Dimension_get(long jarg1);
  public final static native long Polyhedron_NbConstraints_get(long jarg1);
  public final static native long Polyhedron_NbRays_get(long jarg1);
  public final static native long Polyhedron_NbEq_get(long jarg1);
  public final static native long Polyhedron_NbBid_get(long jarg1);
  public final static native long Polyhedron_Constraint_get(long jarg1);
  public final static native long Polyhedron_Ray_get(long jarg1);
  public final static native long Polyhedron_p_Init_get(long jarg1);
  public final static native int Polyhedron_p_Init_size_get(long jarg1);
  public final static native long Polyhedron_next_get(long jarg1);
  public final static native int POL_INEQUALITIES_get();
  public final static native int POL_FACETS_get();
  public final static native int POL_POINTS_get();
  public final static native int POL_VERTICES_get();
  public final static native int POL_VALID_get();
  public final static native long Polyhedron_flags_get(long jarg1);
  public final static native long new_Polyhedron();
  public final static native void delete_Polyhedron(long jarg1);
  public final static native int Interval_MaxN_get(long jarg1);
  public final static native int Interval_MaxD_get(long jarg1);
  public final static native int Interval_MinN_get(long jarg1);
  public final static native int Interval_MinD_get(long jarg1);
  public final static native int Interval_MaxI_get(long jarg1);
  public final static native int Interval_MinI_get(long jarg1);
  public final static native long new_Interval();
  public final static native void delete_Interval(long jarg1);
  public final static native long Param_Vertices_Vertex_get(long jarg1);
  public final static native long Param_Vertices_Domain_get(long jarg1);
  public final static native long Param_Vertices_next_get(long jarg1);
  public final static native long new_Param_Vertices();
  public final static native void delete_Param_Vertices(long jarg1);
  public final static native long Param_Domain_F_get(long jarg1);
  public final static native long Param_Domain_Domain_get(long jarg1);
  public final static native long Param_Domain_next_get(long jarg1);
  public final static native long new_Param_Domain();
  public final static native void delete_Param_Domain(long jarg1);
  public final static native int Param_Polyhedron_nbV_get(long jarg1);
  public final static native long Param_Polyhedron_V_get(long jarg1);
  public final static native long Param_Polyhedron_D_get(long jarg1);
  public final static native long new_Param_Polyhedron();
  public final static native void delete_Param_Polyhedron(long jarg1);
  public final static native int evalue_d_get(long jarg1);
  public final static native long evalue_x_get(long jarg1);
  public final static native long new_evalue();
  public final static native void delete_evalue(long jarg1);
  public final static native int evalue_x_n_get(long jarg1);
  public final static native long evalue_x_p_get(long jarg1);
  public final static native long new_evalue_x();
  public final static native void delete_evalue_x(long jarg1);
  public final static native int enode_type_get(long jarg1);
  public final static native int enode_size_get(long jarg1);
  public final static native int enode_pos_get(long jarg1);
  public final static native long enode_arr_get(long jarg1);
  public final static native long new_enode3();
  public final static native void delete_enode(long jarg1);
  public final static native long Enumeration_ValidityDomain_get(long jarg1);
  public final static native long Enumeration_EP_get(long jarg1);
  public final static native long Enumeration_next_get(long jarg1);
  public final static native long new_Enumeration();
  public final static native void delete_Enumeration(long jarg1);
  public final static native int False_get();
  public final static native int True_get();
  public final static native long LatticeUnion_M_get(long jarg1);
  public final static native long LatticeUnion_next_get(long jarg1);
  public final static native long new_LatticeUnion();
  public final static native void delete_LatticeUnion(long jarg1);
  public final static native long ZPolyhedron_Lat_get(long jarg1);
  public final static native long ZPolyhedron_P_get(long jarg1);
  public final static native long ZPolyhedron_next_get(long jarg1);
  public final static native long new_ZPolyhedron();
  public final static native void delete_ZPolyhedron(long jarg1);
  public final static native void errormsg1(String jarg1, String jarg2, String jarg3);
  public final static native int ConstraintSimplify(long jarg1, long jarg2, int jarg3, long jarg4);
  public final static native long value_alloc(int jarg1, long jarg2);
  public final static native void value_free(long jarg1, int jarg2);
  public final static native void Factorial(int jarg1, long jarg2);
  public final static native void Binomial(int jarg1, int jarg2, long jarg3);
  public final static native void CNP(int jarg1, int jarg2, long jarg3);
  public final static native void Gcd(int jarg1, int jarg2, long jarg3);
  public final static native int First_Non_Zero(long jarg1, long jarg2);
  public final static native long Vector_Alloc(long jarg1);
  public final static native void Vector_Free(long jarg1);
  public final static native void Vector_Print(long jarg1, String jarg2, long jarg3);
  public final static native long Vector_Read();
  public final static native void Vector_Set(long jarg1, int jarg2, long jarg3);
  public final static native void Vector_Exchange(long jarg1, long jarg2, long jarg3);
  public final static native void Vector_Copy(long jarg1, long jarg2, long jarg3);
  public final static native void Vector_Add(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void Vector_Sub(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void Vector_Or(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void Vector_Scale(long jarg1, long jarg2, int jarg3, long jarg4);
  public final static native void Vector_AntiScale(long jarg1, long jarg2, int jarg3, long jarg4);
  public final static native void Inner_Product(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void Vector_Max(long jarg1, long jarg2, long jarg3);
  public final static native void Vector_Min(long jarg1, long jarg2, long jarg3);
  public final static native void Vector_Combine(long jarg1, long jarg2, long jarg3, int jarg4, int jarg5, long jarg6);
  public final static native int Vector_Equal(long jarg1, long jarg2, long jarg3);
  public final static native void Vector_Min_Not_Zero(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void Vector_Gcd(long jarg1, long jarg2, long jarg3);
  public final static native void Vector_Map(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native void Vector_Normalize(long jarg1, long jarg2);
  public final static native void Vector_Normalize_Positive(long jarg1, int jarg2, int jarg3);
  public final static native void Vector_Reduce(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void Vector_Sort(long jarg1, long jarg2);
  public final static native int Vector_IsZero(long jarg1, long jarg2);
  public final static native long Matrix_Alloc(long jarg1, long jarg2);
  public final static native void Matrix_Free(long jarg1);
  public final static native void Matrix_Print(long jarg1, String jarg2, long jarg3);
  public final static native void Matrix_Read_Input(long jarg1);
  public final static native long Matrix_Read();
  public final static native void right_hermite(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void left_hermite(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native int MatInverse(long jarg1, long jarg2);
  public final static native void rat_prodmat(long jarg1, long jarg2, long jarg3);
  public final static native void Matrix_Vector_Product(long jarg1, long jarg2, long jarg3);
  public final static native void Vector_Matrix_Product(long jarg1, long jarg2, long jarg3);
  public final static native void Matrix_Product(long jarg1, long jarg2, long jarg3);
  public final static native int Matrix_Inverse(long jarg1, long jarg2);
  public final static native void Polyhedron_Compute_Dual(long jarg1);
  public final static native long DomainConstraintSimplify(long jarg1, long jarg2);
  public final static native long AddConstraints(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long AddPolyToDomain(long jarg1, long jarg2);
  public final static native long AddRays(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long align_context(long jarg1, int jarg2, int jarg3);
  public final static native long Constraints2Polyhedron(long jarg1, long jarg2);
  public final static native long Disjoint_Domain(long jarg1, int jarg2, long jarg3);
  public final static native long DomainAddConstraints(long jarg1, long jarg2, long jarg3);
  public final static native long DomainAddRays(long jarg1, long jarg2, long jarg3);
  public final static native long DomainConvex(long jarg1, long jarg2);
  public final static native long DomainCost(long jarg1, long jarg2);
  public final static native long DomainDifference(long jarg1, long jarg2, long jarg3);
  public final static native long DomainImage(long jarg1, long jarg2, long jarg3);
  public final static native long DomainIntersection(long jarg1, long jarg2, long jarg3);
  public final static native long DomainPreimage(long jarg1, long jarg2, long jarg3);
  public final static native long DomainSimplify(long jarg1, long jarg2, long jarg3);
  public final static native long Stras_DomainSimplify(long jarg1, long jarg2, long jarg3);
  public final static native long DomainUnion(long jarg1, long jarg2, long jarg3);
  public final static native long Domain_Copy(long jarg1);
  public final static native void Domain_Free(long jarg1);
  public final static native void Domain_PrintConstraints(long jarg1, String jarg2, long jarg3);
  public final static native long Empty_Polyhedron(long jarg1);
  public final static native int Gauss(long jarg1, int jarg2, int jarg3);
  public final static native int lower_upper_bounds(int jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long Polyhedron2Constraints(long jarg1);
  public final static native long Polyhedron2Rays(long jarg1);
  public final static native int PolyhedronIncludes(long jarg1, long jarg2);
  public final static native long Polyhedron_Alloc(long jarg1, long jarg2, long jarg3);
  public final static native long Polyhedron_Copy(long jarg1);
  public final static native void Polyhedron_Free(long jarg1);
  public final static native long Polyhedron_Image(long jarg1, long jarg2, long jarg3);
  public final static native long Polyhedron_Preimage(long jarg1, long jarg2, long jarg3);
  public final static native void Polyhedron_Print(long jarg1, String jarg2, long jarg3);
  public final static native void Polyhedron_PrintConstraints(long jarg1, String jarg2, long jarg3);
  public final static native long Polyhedron_Scan(long jarg1, long jarg2, long jarg3);
  public final static native void PolyPrint(long jarg1);
  public final static native long Rays2Polyhedron(long jarg1, long jarg2);
  public final static native long SubConstraint(long jarg1, long jarg2, long jarg3, int jarg4);
  public final static native long Universe_Polyhedron(long jarg1);
  public final static native void Compute_PDomains(long jarg1, int jarg2, int jarg3);
  public final static native long GenParamPolyhedron(long jarg1);
  public final static native void Param_Domain_Free(long jarg1);
  public final static native void Param_Polyhedron_Free(long jarg1);
  public final static native void Param_Vertices_Free(long jarg1);
  public final static native void Param_Vertices_Print(long jarg1, long jarg2, long jarg3);
  public final static native long PDomainDifference(long jarg1, long jarg2, long jarg3);
  public final static native long PDomainIntersection(long jarg1, long jarg2, long jarg3);
  public final static native long Polyhedron2Param_Domain(long jarg1, long jarg2, int jarg3);
  public final static native long Polyhedron2Param_SimplifiedDomain(long jarg1, long jarg2, int jarg3, long jarg4, long jarg5);
  public final static native long Polyhedron2Param_Vertices(long jarg1, long jarg2, int jarg3);
  public final static native void Print_Domain(long jarg1, long jarg2, long jarg3);
  public final static native void Print_Vertex(long jarg1, long jarg2, long jarg3);
  public final static native long VertexCT(long jarg1, long jarg2);
  public final static native long Read_ParamNames(long jarg1, int jarg2);
  public final static native int GaussSimplify(long jarg1, long jarg2);
  public final static native int PolyhedronLTQ(long jarg1, long jarg2, int jarg3, int jarg4, int jarg5);
  public final static native int PolyhedronTSort(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7);
  public final static native int Polyhedron_Not_Empty(long jarg1, long jarg2, int jarg3);
  public final static native int overflow_warning_flag_get();
  public final static native void count_points(int jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void eadd(long jarg1, long jarg2);
  public final static native long ecopy(long jarg1);
  public final static native void edot(long jarg1, long jarg2, long jarg3);
  public final static native long new_enode(int jarg1, int jarg2, int jarg3);
  public final static native void free_evalue_refs(long jarg1);
  public final static native long Polyhedron_Enumerate(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void print_enode(long jarg1, long jarg2, long jarg3);
  public final static native void print_evalue(long jarg1, long jarg2, long jarg3);
  public final static native void reduce_evalue(long jarg1);
  public final static native void Enumeration_Free(long jarg1);
  public final static native long Ehrhart_Quick_Apx(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long Enumeration_zero(long jarg1, long jarg2);
  public final static native long Domain_Enumerate(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void new_eadd(long jarg1, long jarg2);
  public final static native double compute_evalue(long jarg1, long jarg2);
  public final static native long compute_poly(long jarg1, long jarg2);
  public final static native int in_domain(long jarg1, long jarg2);
  public final static native int SolveDiophantine(long jarg1, long jarg2, long jarg3);
  public final static native void AffineHermite(long jarg1, long jarg2, long jarg3);
  public final static native void AffineSmith(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long ChangeLatticeDimension(long jarg1, int jarg2);
  public final static native long EmptyLattice(int jarg1);
  public final static native long ExtractLinearPart(long jarg1);
  public final static native int FindHermiteBasisofDomain(long jarg1, long jarg2);
  public final static native long Homogenise(long jarg1, int jarg2);
  public final static native int intcompare(long jarg1, long jarg2);
  public final static native int isEmptyLattice(long jarg1);
  public final static native int isfulldim(long jarg1);
  public final static native int IsLattice(long jarg1);
  public final static native int isLinear(long jarg1);
  public final static native long LatticeDifference(long jarg1, long jarg2);
  public final static native long LatticeImage(long jarg1, long jarg2);
  public final static native int LatticeIncludes(long jarg1, long jarg2);
  public final static native long LatticeIntersection(long jarg1, long jarg2);
  public final static native long LatticePreimage(long jarg1, long jarg2);
  public final static native long LatticeSimplify(long jarg1);
  public final static native long LatticeUnion_Alloc();
  public final static native void LatticeUnion_Free(long jarg1);
  public final static native void PrintLatticeUnion(long jarg1, String jarg2, long jarg3);
  public final static native int sameAffinepart(long jarg1, long jarg2);
  public final static native int sameLattice(long jarg1, long jarg2);
  public final static native long Lattice2LatticeUnion(long jarg1, long jarg2);
  public final static native void Lcm3(int jarg1, int jarg2, long jarg3);
  public final static native long AddANullColumn(long jarg1);
  public final static native long AddANullRow(long jarg1);
  public final static native void ExchangeColumns(long jarg1, int jarg2, int jarg3);
  public final static native void ExchangeRows(long jarg1, int jarg2, int jarg3);
  public final static native int findHermiteBasis(long jarg1, long jarg2);
  public final static native long Identity(long jarg1);
  public final static native int isinHnf(long jarg1);
  public final static native int isIntegral(long jarg1);
  public final static native long Lcm(int jarg1, int jarg2);
  public final static native long Matrix_Copy(long jarg1);
  public final static native void PutColumnFirst(long jarg1, int jarg2);
  public final static native void PutColumnLast(long jarg1, int jarg2);
  public final static native void PutRowFirst(long jarg1, int jarg2);
  public final static native void PutRowLast(long jarg1, int jarg2);
  public final static native long RemoveNColumns(long jarg1, int jarg2, int jarg3);
  public final static native long RemoveColumn(long jarg1, int jarg2);
  public final static native long RemoveRow(long jarg1, int jarg2);
  public final static native long Transpose(long jarg1);
  public final static native void Smith(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void Hermite(long jarg1, long jarg2, long jarg3);
  public final static native void CanonicalForm(long jarg1, long jarg2, long jarg3);
  public final static native long EmptyZPolyhedron(int jarg1);
  public final static native long IntegraliseLattice(long jarg1);
  public final static native int isEmptyZPolyhedron(long jarg1);
  public final static native long ZDomainDifference(long jarg1, long jarg2);
  public final static native long ZDomainImage(long jarg1, long jarg2);
  public final static native int ZDomainIncludes(long jarg1, long jarg2);
  public final static native long ZDomainIntersection(long jarg1, long jarg2);
  public final static native long ZDomainPreimage(long jarg1, long jarg2);
  public final static native void ZDomainPrint(long jarg1, String jarg2, long jarg3);
  public final static native long ZDomainSimplify(long jarg1);
  public final static native long ZDomainUnion(long jarg1, long jarg2);
  public final static native long ZDomain_Copy(long jarg1);
  public final static native void ZDomain_Free(long jarg1);
  public final static native int ZPolyhedronIncludes(long jarg1, long jarg2);
  public final static native long ZPolyhedron_Alloc(long jarg1, long jarg2);
  public final static native long SplitZpolyhedron(long jarg1, long jarg2);
  public final static native long constraintsView(long jarg1);
  public final static native void constraintsView_Free(long jarg1);
  public final static native void split_constraints(long jarg1, long jarg2, long jarg3);
  public final static native long Identity_Matrix(long jarg1);
  public final static native void mtransformation_inverse(long jarg1, long jarg2, long jarg3);
  public final static native void mpolyhedron_simplify(long jarg1);
  public final static native void mpolyhedron_inflate(long jarg1, long jarg2);
  public final static native void mpolyhedron_deflate(long jarg1, long jarg2);
  public final static native void eliminate_var_with_constr(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native void mpolyhedron_compress_last_vars(long jarg1, long jarg2);
  public final static native long mpolyhedron_eliminate_first_variables(long jarg1, long jarg2);
  public final static native void Matrix_subMatrix(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native void Matrix_copySubMatrix(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8);
  public final static native void Matrix_oppose(long jarg1);
  public final static native long nb_bits(java.math.BigInteger jarg1);
  public final static native long permutation_inverse(long jarg1, long jarg2);
  public final static native long mtransformation_permute(long jarg1, long jarg2);
  public final static native long mpolyhedron_permute(long jarg1, long jarg2);
  public final static native void Constraints_permute(long jarg1, long jarg2, long jarg3);
  public final static native java.math.BigInteger eliminable_vars(long jarg1, long jarg2, long jarg3);
  public final static native long find_a_permutation(long jarg1, long jarg2);
  public final static native long permutation_for_full_dim2(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void Equalities_integerSolution(long jarg1, long jarg2);
  public final static native void Equalities_validityLattice(long jarg1, int jarg2, long jarg3);
  public final static native void Equalities_intModBasis(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void Constraints_fullDimensionize(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, int jarg8);
  public final static native long Constraints_Remove_parm_eqs(long jarg1, long jarg2, int jarg3, long jarg4);
  public final static native void Constraints_removeElimCols(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void Lattice_extractSubLattice(long jarg1, long jarg2, long jarg3);
  public final static native long Polyhedron_Remove_parm_eqs(long jarg1, long jarg2, int jarg3, long jarg4, int jarg5);
  public final static native long int_ker(long jarg1);
  public final static native long full_dimensionize(long jarg1, int jarg2, long jarg3);
  public final static native long affine_periods(long jarg1, long jarg2);
  public final static native long int_mod_basis(long jarg1, long jarg2, long jarg3);
  public final static native long compress_parms(long jarg1, int jarg2);
}